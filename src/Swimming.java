public static class Swimming extends Activity{

    public Swimming(String name, String place, Boolean isFree) {
        super(name, place, isFree);
    }
}

Activity swimming1 = new Swimming("Swimming", "Tensta Simhall", false);
Activity swimming2 = new Swimming("Swimming", "Eriksdalbadet", false);
Activity swimming3 = new Swimming("Swimming", "Akeshov", false);
Activity swimming4 = new Swimming("Swimming", "Stäket", true);
Activity swimming5 = new Swimming("Swimming", "Görvälnsbadet", true);
Activity swimming6 = new Swimming("Swimming", "Lövstabadet", true);

void main() {
}

