package pl.aagenda.familyguard.datastorage.constants;

public final class RelationshipConstants {
    public final class Person {
        public static final String CHILD_OF = "CHILD_OF";
        public static final String SPOUSE_OF = "SPOUSE_OF";
        public static final String WIELDS = "WIELDS";
        public static final String PARTICIPATES = "PARTICIPATES";
    }

    public final class Event {
        public static final String FEATURES = "FEATURES";
    }

    public final class Resource {
        public static final String CONTAINS_ARTIFACT = "CONTAINS_ARTIFACT";
        public static final String CONTAINS_EVENT = "CONTAINS_EVENT";
        public static final String CONTAINS_PERSON = "CONTAINS_PERSON";
    }

    public static final String RELATES = "RELATES";

    private RelationshipConstants() {
        throw new IllegalAccessError();
    }
}
