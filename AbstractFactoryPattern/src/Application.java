public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createBotton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
