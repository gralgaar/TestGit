package home_work.lesson017.task03;

public enum Shape {
    TRIANGLE {
        public String createShapeString(int length) {
            String triangle = EMPTY_STRING;

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - i; j++) {
                    triangle += EMPTY_ELEMENT;
                }

                triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                for (int j = 0; j < i * 2; j++) {
                    triangle += EMPTY_ELEMENT;
                }

                triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
            }

            triangle += " ";

            for (int i = 0; i < length; i++) {
                triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
            }

            return triangle;
        }

        //public String
    },
    SQUARE {
        public String createShapeString(int length) {
            String horizontalLine = createHorizontalLine(length);
            String verticalLines = createVerticalLines(length);
            return horizontalLine + verticalLines + horizontalLine;

        }

        private static String createHorizontalLine(int length) {
            String horizontalLine = EMPTY_ELEMENT;

            for (int i = 0; i < length; i++) {
                horizontalLine += RECTANGLE_HORIZONTAL_ELEMENT;
            }

            horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;

            return horizontalLine;
        }

        private static String createVerticalLines(int length) {
            String verticalLinesUnit = getVerticalLinesUnit(length);

            String verticalLines = EMPTY_STRING;

            for (int i = 0; i < length; i++) {
                verticalLines += verticalLinesUnit;
            }

            return verticalLines;
        }

        private static String getVerticalLinesUnit(int length) {
            String verticalLinesUnit = RECTANGLE_VERTICAL_ELEMENT;

            for (int i = 0; i < length; i++) {
                verticalLinesUnit += EMPTY_ELEMENT;
            }

            verticalLinesUnit += RECTANGLE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

            return verticalLinesUnit;
        }


    };

    public abstract String createShapeString(int length);

    private static final String EMPTY_ELEMENT = " ";
    private static final String EMPTY_STRING = "";
    private static final char NEW_LINE_SYMBOL = '\n';

    private static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";
    private static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    private static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";

    private static final String RECTANGLE_HORIZONTAL_ELEMENT = "-";
    private static final String RECTANGLE_VERTICAL_ELEMENT = "|";

}
