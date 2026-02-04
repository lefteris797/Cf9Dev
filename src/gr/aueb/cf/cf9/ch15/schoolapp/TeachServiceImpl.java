package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeachServiceImpl implements ITeacherService{

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added succesfully");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated succesfully");
    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher removed succesfully");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "Athanassios", "Androutsos");
    }

    @Override
    public Teacher[] getAllTeachers() {
       Teacher[] teachers = {
                new Teacher(1L, "Athanassios", "Androutsos"),
                new Teacher(2L, "Pavlos", "Karagounis"),
                new Teacher(3L, "Dimitrios", "Nikolos"),
                new Teacher(4L, "Athanassios", "Poulakis")
        };
        return teachers;
    }
}
