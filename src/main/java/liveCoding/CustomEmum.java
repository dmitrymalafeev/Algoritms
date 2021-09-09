package liveCoding;

import java.util.*;

public class CustomEmum {
    private static int counter = 0;

    private final int order;

    private String name;

    private static List<CustomEmum> values = new ArrayList<>();


    public static final CustomEmum ЗАПАД = new CustomEmum("ЗАПАД");
    public static final CustomEmum СЕВЕР = new CustomEmum( "СЕВЕР");
    public static final CustomEmum ВОСТОК = new CustomEmum( "ВОСТОК");
    public static final CustomEmum ЮГ = new CustomEmum( "ЮГ");



    private CustomEmum(String name) {
        this.order = counter++;
        this.name = name;
        values.add(this);
    }

    public int ordinal() {
        return order;
    }

    public static Collection<CustomEmum> values () {
        return Collections.unmodifiableList(values);
    }

    public CustomEmum getByOrdinal(int ordinal) {
        if (ordinal < 0 && ordinal > values.size() - 1) {
            throw new IllegalArgumentException();
        }
        return values.get(ordinal);
    }

    public static Optional<CustomEmum> getByName(String name) {
        for (CustomEmum value : values) {
            if (value.name.equals(name)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        System.out.println(liveCoding.CustomEmum.ВОСТОК);
//        for (liveCoding.CustomEmum value : values) {
//            System.out.println(value.name);
//        }
//        for (liveCoding.CustomEmum value : values) {
//            System.out.println(value.name + " " + value.ordinal());
//        }

        System.out.println(getByName("СЕВЕР"));

    }

}
