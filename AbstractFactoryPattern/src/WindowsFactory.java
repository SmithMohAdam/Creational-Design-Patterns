public class WindowsFactory implements GUIFactory{
    @Override
    public Button createBotton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
