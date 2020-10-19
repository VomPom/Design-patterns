package julis.wang.mediator;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:21
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class Editor implements Mediator {
    TextComponent textComponent;
    ButtonComponent buttonComponent;

    @Override
    public void addText() {
        textComponent.addText();
    }

    @Override
    public void clear() {
        buttonComponent.clear();
    }

    @Override
    public void registerComponent(Component component) {
        String componentName = component.getName();
        switch (componentName) {
            case "text":
                textComponent = (TextComponent) component;
                break;
            case "button":
                buttonComponent = (ButtonComponent) component;
                break;
            default:
        }
    }
}
