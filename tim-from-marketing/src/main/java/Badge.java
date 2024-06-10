class Badge {
    public String print(Integer id, String name, String department) {
        String label = getString(id, name, department);

      return label;
    }

    private static String getString(Integer id, String name, String department) {
        if(id != null && department != null && name != null){
            String label = "[" + id + "] - " + name + " - " + department.toUpperCase();
            return label;
        }
        if(id == null && department != null){
            String label = name + " - " + department.toUpperCase();
            return label;
        }
        if(department == null && id != null){
            String label = "[" + id + "] - " + name + " - OWNER";
            return label;
        }
        if(id == null && department == null) {
            String label = name + " - OWNER";
            return label;
        }
        return null;
    }
}
