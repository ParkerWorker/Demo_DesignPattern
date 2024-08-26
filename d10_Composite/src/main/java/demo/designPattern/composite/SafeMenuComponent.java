package demo.designPattern.composite;

/**
 * 菜单组件  不管是菜单还是菜单项，都应该实现该接口 - 安全组合模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:24
 **/
public interface SafeMenuComponent {

    /**
     * 获取菜单名称
     *
     * @return 返回组件名称字符串
     */
    String getName();

    /**
     * 打印菜单组件
     */
    default void print() {
        throw new UnsupportedOperationException();
    }
}
