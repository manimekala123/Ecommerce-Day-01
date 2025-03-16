class AudioBook extends Book {
    private double duration;

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Duration: " + duration + " hours";
    }
}