import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.isEmpty())
            return true;
        return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        if(!languages.contains(language))
            return false;
        return languages.contains(language);
    }

    public boolean isExciting() {
        if(languages.contains("Java") || languages.contains("Kotlin"))
            return true;

        if(!languages.contains("Java") && !languages.contains("Kotlin"))
            return false;

        return false;
    }
}
