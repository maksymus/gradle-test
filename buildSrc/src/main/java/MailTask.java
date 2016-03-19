import org.gradle.api.*;
import org.gradle.api.tasks.*;
import javax.inject.*;

class MailTask extends DefaultTask {
    private String to;
    private String content;

    @Inject
    public MailTask() {}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @TaskAction
    public void greet() {
        System.out.println("Sending mail to " + to + ": " + content);
    }
}