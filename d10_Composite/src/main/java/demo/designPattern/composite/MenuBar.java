package demo.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单栏组件
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:26
 **/
public class MenuBar implements TransparentMenuComponent {

    private final int level;
    private final String name;

    private final List<SafeMenuComponent> menuComponentList;

    public MenuBar(String name, int level) {
        this.level = level;
        this.name = name;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(TransparentMenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(TransparentMenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public TransparentMenuComponent getChild(int i) {
        return (TransparentMenuComponent) menuComponentList.get(i);
    }

    public void add(SafeMenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void remove(SafeMenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void print() {

        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (SafeMenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
