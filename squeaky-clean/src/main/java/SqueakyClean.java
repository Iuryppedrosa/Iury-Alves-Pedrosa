class SqueakyClean {
    static String clean(String identifier) {
        if(identifier.isEmpty()) {
            return "";
        }
        // Substituir espaços por sublinhados
        if(identifier.contains(" ")) {
            identifier = identifier.replaceAll(" ", "_");
        }
        // Converter kebab-case para camelCase
        if(identifier.contains("-")){
            String[] parts = identifier.split("-");
            StringBuilder sb = new StringBuilder(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                sb.append(parts[i].substring(0, 1)
                                .toUpperCase())
                        .append(parts[i]
                                .substring(1));
            }
            identifier = sb.toString();
        }
        // Converter leetspeak para texto normal
        if (identifier.contains("1") ||
                identifier.contains("3") ||
                identifier.contains("4") ||
                identifier.contains("0") ||
                identifier.contains("7") ||
                identifier.contains("¡")) {
            identifier = identifier.replaceAll("1", "l")
                    .replaceAll("3", "e")
                    .replaceAll("4", "a")
                    .replaceAll("0", "o")
                    .replaceAll("7", "t")
                    .replaceAll("¡", " ")
                    .replaceAll("!", " ");
        }
        // Omitir caracteres que não são letras
        identifier = identifier.replaceAll("[^a-zA-Z_]", "");
        return identifier;
    }
}
