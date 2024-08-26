package demo.designPattern.flyweight;

import demo.designPattern.flyweight.shape.*;

import java.util.HashMap;

/**
 * 工厂类 - 用来管理享元对象
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 16:48
 **/
public class ShapeFactory {

    private static HashMap<String, AbsShape> map;

    private ShapeFactory() {
        map = new HashMap<>();
        AbsShape iShape = new IShape();
        AbsShape jShape = new JShape();
        AbsShape lShape = new LShape();
        AbsShape oShape = new OShape();
        AbsShape sShape = new SShape();
        AbsShape tShape = new TShape();
        AbsShape zShape = new ZShape();
        map.put("I", iShape);
        map.put("J", jShape);
        map.put("L", lShape);
        map.put("O", oShape);
        map.put("S", sShape);
        map.put("T", tShape);
        map.put("Z", zShape);
    }

    public static ShapeFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ShapeFactory INSTANCE = new ShapeFactory();
    }

    public AbsShape getBox(String key) {
        return map.get(key);
    }
}
