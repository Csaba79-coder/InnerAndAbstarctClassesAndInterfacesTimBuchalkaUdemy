import model.DeskPhone;
import model.ITelephone;
import model.MobilePhone;

public class Main {

    public static void main(String[] args) {

        // how to decide to use interface or inheritance
        // the answer what is the relation of the final class with the object itself!!! (that is extends or implements)

        // like here Mobile is a computer that has a Phone interface as you can use also for phone
        // both MobilePhone and DeskPhone can make phoneCalls, that means better to implement a phone interface
        // rather than extending a phone call class

        // in JAVA multiple inheritance is only available by implementing several interfaces!

        // not all animals can walk, so we cannot put a walk method in the animal base class, but we could define, say, a walk interface, though!
        // E.g a Dog would extend Animal and implement Walk!
        // E.g a Bird would extend Animal and implement Walk and implement Fly!!! (this is how you can solve it!)

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
