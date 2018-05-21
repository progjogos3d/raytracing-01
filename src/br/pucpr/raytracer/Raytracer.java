package br.pucpr.raytracer;

import static br.pucpr.raytracer.Vector3fOps.*;

import org.joml.Vector3f;

import br.pucpr.raytracer.primitives.Primitive;
import br.pucpr.raytracer.primitives.Result;

public class Raytracer {
    private static final float INFINITE = 1000000.0f;

    private Canvas canvas;
    private Scene scene = new Scene();

    public Raytracer() {
        this(1.5f);
    }

    public Raytracer(float zoom) {
        this.canvas = new Canvas(1024, 768);
    }

    public void render() {
        canvas.save();
    }

    public Vector3f raytrace(Ray ray) {
        return scene.getBackground();
    }
}
