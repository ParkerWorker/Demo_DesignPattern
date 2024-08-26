package demo.designPattern.composite;

/**
 * 菜单按钮组件
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:29
 **/
public class MenuItem implements TransparentMenuComponent {
    private final int level;
    private final String name;

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
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
    }
}
