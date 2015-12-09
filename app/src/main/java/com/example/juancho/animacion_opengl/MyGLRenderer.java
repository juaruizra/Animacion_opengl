package com.example.juancho.animacion_opengl;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {

    private Triangle mTriangle;

    public void onSurfaceCreated(GL10 unused, EGLConfig config) {


    }

    public void onDrawFrame(GL10 unused) {


    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {


    }


    public static int loadShader(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }

}