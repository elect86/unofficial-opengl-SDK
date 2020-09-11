module com.github.kotlin_graphics.uno.awt {

    requires kotlin.stdlib;

    requires com.github.kotlin_graphics.gln;
    requires com.github.kotlin_graphics.glm;
    requires com.github.kotlin_graphics.uno.core;

    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;
    requires org.lwjgl.jawt;

    requires java.desktop;
    requires com.github.kotlin_graphics.kool;

    exports uno.awt;
}