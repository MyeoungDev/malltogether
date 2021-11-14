package store.malltogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store.malltogether.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // 영속성 관리, 엔티티 매니저 주입
//    @PersistenceContext
//    private EntityManager em;

    // 만들어야될꺼 우선 로그인 기능부터? 이렇게 따라가는것보단 우선 로그인부터!

//    public void save(User user) {
//        em.persist(user);
//    }

//    public User findOne(Long id) {
//        User findUser = em.find(User.class, id);
//        return findUser;
//    }

//    public void findByName(String name) {
//
//    }

}
