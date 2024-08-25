package demo.designPattern.builder.expand;

/**
 * 复杂的对象 - 手机
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 18:57
 **/
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    /**
     * 一般复杂对象使用 多参数构造函数
     *
     * @param cpu       cpu
     * @param screen    屏幕
     * @param memory    内存
     * @param mainboard 主板
     */
    public Phone(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }
    // getter and setter  ...


    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    /**
     * 改进 - 使用建造器的构造函数
     *
     * @param builder 复杂的信息的建造器
     */
    private Phone(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    /**
     * 改进 - 建造器类
     */
    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
