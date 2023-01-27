package Models;

class Category extends MainCategory {
    private String categoryName;

    public Category(String mainCategoryName, String categoryName) {
        super(mainCategoryName);
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
