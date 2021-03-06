module kotlin.graphics.uno.core {

    requires kotlin.stdlib;

    requires java.desktop;

    requires org.lwjgl;

    requires kotlin.graphics.gln;
//    requires com.github.kotlin_graphics.gli;
//    requires com.github.kotlin_graphics.glm;
//    requires com.github.kotlin_graphics.kool;
//    requires com.github.kotlin_graphics.kotlin_unsigned;
    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;

    exports uno.buffer;
    exports uno.convert;
    exports uno.glfw;
    exports uno.glm;
    exports uno.kotlin;
//    exports uno.mousePole;
    exports uno.stb;
    exports uno.time;
}