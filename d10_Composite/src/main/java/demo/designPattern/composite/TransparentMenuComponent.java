package demo.designPattern.composite;

/**
 * 菜单组件  不管是菜单还是菜单项，都应该实现该接口 - 透明组合模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:19
 **/
public interface TransparentMenuComponent extends SafeMenuComponent{

    /**
     * 添加菜单
     *
     * @param menuComponent 菜单组件
     */
    default void add(TransparentMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单
     *
     * @param menuComponent 菜单组件
     */
    default void remove(TransparentMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     *
     * @param i 组件索引
     * @return 返回对应的组件
     */
    default TransparentMenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
