package io.javabrains.springsecurityjwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getuser(s);
    }

    public UserDetails getuser(String userName) {
        Map<String, UserDetails> userDetailsMap = new HashMap<>();
        userDetailsMap.put("foo", new User("foo", "foo",
                new ArrayList<>()));
        userDetailsMap.put("test", new User("test", "test",
                new ArrayList<>()));
        return userDetailsMap.get(userName);
    }
}