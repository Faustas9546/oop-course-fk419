class Vector2D {
    private final float x, y;

    Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Vector2D add(Vector2D other) {
        return new Vector2D(x + other.x, y + other.y);
    }

    float scalarProduct(Vector2D other) {
        return x * other.x + y * other.y;
    }

    float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    Vector2D normalise() {
        float length = magnitude();
        if (length != 0) {
            return new Vector2D(x/length, y/length);
        }
        return new Vector2D(0, 0);
    }
}