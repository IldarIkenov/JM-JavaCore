package jm.tasks.functioninterfecesstreams.task7213;

public class MailMessage extends Sendable<String>{
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }

}
