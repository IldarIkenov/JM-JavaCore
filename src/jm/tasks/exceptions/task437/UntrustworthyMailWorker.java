package jm.tasks.exceptions.task437;

/*
UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать
почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц, а затем,
в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. У UntrustworthyMailWorker
должен быть конструктор от массива MailService (результат вызова processMail первого элемента массива передается
на вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку на внутренний
экземпляр RealMailService, он не приходит массивом в конструкторе и не настраивается извне класса.
 */
public class UntrustworthyMailWorker implements MailService {
    private final RealMailService realMailService = new RealMailService();
    private final MailService[] mailService;

    public UntrustworthyMailWorker (MailService[] mailService) {
        this.mailService = mailService;
    }


    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService ms : mailService) {
            mail = ms.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
