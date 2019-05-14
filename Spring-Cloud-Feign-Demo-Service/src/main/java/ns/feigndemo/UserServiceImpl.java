package ns.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserServiceInterface{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User findById(int id) {
        return userRepository.findOneById(id);
    }
}
