package hw8;

public class Main {
    public static void main(String[] args) {
        JumpableRunnable[] participants = {
                new Human(3, 3, "John"),
                new Cat(4, 5, "Bullet"),
                new Robot(0, 15, "Eva"),
        };

        Barrier [] hindrances = {
                new RunningTrack(2),
                new RunningTrack(5),
                new Wall(2),
                new Wall(4)
        };

        for (JumpableRunnable participant : participants) {
            System.out.println("К дистанции приступает " + participant);
            boolean winner = true;
            for (Barrier hindrance : hindrances) {
                System.out.println(participant + " пробует пройти " + hindrance);
                if (hindrance.toJump(participant.getMaxHeight()) ||
                        hindrance.toRun(participant.getMaxLength())) {
                    System.out.println("Получилось");
                } else {
                    winner = false;
                    System.out.println("Не получилось");
                    break;
                }
            }

            if(winner) {
                System.out.println(participant + " прошёл дистанцию");
            } else {
                System.out.println(participant + " проиграл");
            }
            System.out.println();
        }
    }
}
