class InvalidColorException extends Exception {
    public InvalidColorException(String message) {
        super(message);
    }
}

class Color {
    private String colorName;

    public Color(String colorName) throws InvalidColorException {
        setColorName(colorName);
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) throws InvalidColorException {
        if (!isValidColor(colorName)) {
            throw new InvalidColorException("Invalid color: " + colorName);
        }
        this.colorName = colorName;
    }

    private boolean isValidColor(String colorName) {
        return "red".equalsIgnoreCase(colorName) || "green".equalsIgnoreCase(colorName) || "white".equalsIgnoreCase(colorName);
    }

    @Override
    public String toString() {
        return "Color [colorName=" + colorName + "]";
    }

    public static void main(String[] args) {
        try {
            Color color1 = new Color("red");
            System.out.println(color1);

            Color color2 = new Color("blue"); // This will throw an exception
            System.out.println(color2);
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
    }
}
