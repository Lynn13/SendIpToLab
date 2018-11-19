import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MailOperation operation = new MailOperation();
        String user = "YourEmail";
        String password = "YourPassword";
        String host = "mail.bupt.edu.cn";
        String from = "liujinduo@bupt.edu.cn";
        String to = "liujinduo@bupt.edu.cn";
        String subject = "宿舍ip";

        // get local ip
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // gen content
        String content = "time:" + new Date();
        content += "\n\t ip:" + ip;

        // send
        try {
            String res = operation.sendMail(user, password, host, from, to,
                    subject, content);
            System.out.println(res);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
