package kr.co.toppings.core.infrastructure.persistence.user;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.toppings.core.domain.user.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
