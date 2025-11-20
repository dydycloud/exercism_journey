class Badge {
    public String print(Integer id, String name, String department) {
        if(department == null) {
            if(id == null){
                return String.format("%s - OWNER", name);
            }
            return String.format("[%s] - %s - OWNER", id, name);
        }
        else if(id == null){
            return String.format("%s - %s", name, department.toUpperCase());
        }
        else{
            return String.format("[%s] - %s - %s", id, name, department.toUpperCase());
        }
    }
}
