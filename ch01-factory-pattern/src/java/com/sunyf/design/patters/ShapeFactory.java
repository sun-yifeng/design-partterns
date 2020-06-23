package com.sunyf.design.patters;

public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleImpl();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleImpl();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new CircleImpl();
        }
        return null;
    }
}
