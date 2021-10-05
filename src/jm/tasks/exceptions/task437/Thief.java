package jm.tasks.exceptions.task437;
/*
вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе переменную int –
минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен присутствовать
метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал. Воровство происходит
следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с нулевой ценностью и
содержимым посылки "stones instead of {content}".
 */
public class Thief implements MailService {
    private final int minCostToSteal;
    private int stolenValue = 0;

    public Thief (int minCostToSteal) {
        this.minCostToSteal = minCostToSteal;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package content = ((MailPackage) mail).getContent();
            if (content.getPrice() >= minCostToSteal) {
                stolenValue += content.getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of " + content.getContent(), 0));
            } else {
                return mail;
            }
        }
        return mail;
    }
}
