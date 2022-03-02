import model.DeskPhone;
import model.ITelephone;
import model.MobilePhone;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; // or model.DeskPhone timsPhone; <- explanation later which one and why?! both is valid, but there are some differences!
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.isRinging();
        timsPhone.answer();

        timsPhone = new MobilePhone(987654);
        // timsPhone.powerOn();
        timsPhone.callPhone(987654);
        timsPhone.isRinging();
        timsPhone.answer();

        timsPhone = new MobilePhone(324567);
        timsPhone.powerOn();
        timsPhone.callPhone(324567);
        timsPhone.isRinging();
        timsPhone.answer();
    }
}
