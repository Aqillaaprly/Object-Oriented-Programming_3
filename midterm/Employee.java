public class Employee {
    protected String name;
    protected String role;
    protected int skillLevel;
    
    public Employee(String name, String role, int skillLevel) {
        this.name = name;
        this.role = role;
        this.skillLevel = skillLevel;
    }
    
    public String getName() { 
        return name; }
    public String getRole() { 
        return role; }
    public int getSkillLevel() { 
        return skillLevel; }

    public void performSkill() {
        System.out.println(name + " is performing their job as a " + role);
    }
}
