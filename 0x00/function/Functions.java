public class Functions {
    // Faça somente 1 coisa
    //A
    public void saveCash(Income income, Expense expense){
        inRepo.save(income);
        outRepo.save(expense);
    }

    //Somente 1 nível de abstração
    //A
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }
    // Arguments
    //B
    public void saveUser(String userName, User user, Date date, boolean isAdmin){};

    //  No side effects
    //B
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);
    }

    // Evite duplicados, extraindo para novos métodos
    //A
    public Environment getEnvironment(){
        String version = versionService.getVersion();
        return environmentService.getEnvironment(version);
    }
    public Release getRelease(){
        String version = versionService.getVersion();
        return releaseService.getRelease(version);
    }

}