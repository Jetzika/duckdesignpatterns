public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
