public class MacOSFactory implements GUIFactory{
    @Override
    public Button createBotton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
