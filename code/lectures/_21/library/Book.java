package lectures._21.library;

public record Book(
        String name,
        String author,
        String description,
        int amountOfPages,
        long ISBN,
        int rating
) {}
