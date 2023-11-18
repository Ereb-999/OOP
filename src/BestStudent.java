public class BestStudent {

    public void bestStudentGryffindor(Gryffindor student1, Gryffindor student2){
        int sumStudent1 = student1.getNobility() + student1.getHonor() + student1.getBrave();
        int sumStudent2 = student2.getNobility() + student2.getHonor() + student2.getBrave();
        if(sumStudent1 > sumStudent2){
            System.out.println(student1.getName() + " куда лучший Грффиндорец, чем " + student2.getName());
        } else if (sumStudent1 < sumStudent2){
            System.out.println(student2.getName() + " куда лучший Грффиндорец, чем " + student1.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Гриффиндора.");
        }
        System.out.println();
    }

    public void bestStudentHufflepuff(Hufflepuff student1, Hufflepuff student2){
        int sumStudent1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        int sumStudent2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();
        if(sumStudent1 > sumStudent2){
            System.out.println(student1.getName() + " куда лучший Пуффендуец, чем " + student2.getName());
        } else if (sumStudent1 < sumStudent2){
            System.out.println(student2.getName() + " куда лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Пуффендуя.");
        }
        System.out.println();
    }
    public void bestStudentRavenclaw (Ravenclaw  student1, Ravenclaw  student2){
        int sumStudent1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreativity();
        int sumStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreativity();
        if(sumStudent1 > sumStudent2){
            System.out.println(student1.getName() + " куда лучший Когтевранец, чем " + student2.getName());
        } else if (sumStudent1 < sumStudent2){
            System.out.println(student2.getName() + " куда лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Когтеврана.");
        }
        System.out.println();
    }

    public void bestStudentSlytherin(Slytherin student1, Slytherin student2){
        int sumStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getThirstForPower();
        int sumStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() +
                student2.getResourcefulness() + student2.getThirstForPower();
        if(sumStudent1 > sumStudent2){
            System.out.println(student1.getName() + " куда лучший Слизоринец, чем " + student2.getName());
        } else if (sumStudent1 < sumStudent2){
            System.out.println(student2.getName() + " куда лучший Слизоринецец, чем " + student1.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Слизорина.");
        }
        System.out.println();
    }



}
