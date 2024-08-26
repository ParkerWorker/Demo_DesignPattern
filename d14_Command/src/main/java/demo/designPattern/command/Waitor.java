package demo.designPattern.command;

import java.util.ArrayList;

/**
 * 服务者实体类 - 用于命令的发出者
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:31
 **/
public class Waitor {

    private final ArrayList<Command> commands;//可以持有很多的命令对象

    public Waitor() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
