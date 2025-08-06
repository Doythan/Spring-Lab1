package com.mtcoding.boardprojectdemo.domain.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {
    private final EntityManager em;

    public List<Board> findAll() {
        Query query = em.createNativeQuery("select id, title, content from board_tb order by id desc ");
        List<Object[]> obsList = query.getResultList();
        List<Board> boardList = new ArrayList<>();
        for (Object[] obs : obsList) {
            Integer v1 = (Integer) obs[0];
            String v2 = (String) obs[1];
            String v3 = (String) obs[2];
            Board board = new Board(v1, v2, v3);
            boardList.add(board);
        }
        return boardList;
    }

    public List<Board> findAllV2() {
        Query query = em.createNativeQuery("select id, title, content from board_tb order by id desc", Board.class);
        return query.getResultList();
    }

    public Board findById(int id) {
        Query query = em.createNativeQuery("select id, title, content from board_tb where id = ?");
        query.setParameter(1, id);

        try {
            Object[] obs = (Object[]) query.getSingleResult();
            Integer v1 = (Integer) obs[0];
            String v2 = (String) obs[1];
            String v3 = (String) obs[2];
            Board board = new Board(v1, v2, v3);
            return board;
        } catch (RuntimeException e) {
            return null;
        }
    }

    public Board findByIdV2(int id) {
        Query query = em.createNativeQuery("select id, title, content from board_tb where id = ?", Board.class);
        query.setParameter(1, id);
        try {
            Board board = (Board) query.getSingleResult();
            return board;
        } catch (RuntimeException e) {
            return null;
        }
    }

    @Transactional
    public void save(String title, String content) {
        Query query = em.createNativeQuery("insert into board_tb (title, content) values (?, ?)");
        query.setParameter(1, title);
        query.setParameter(2, content);
        query.executeUpdate();
    }

    @Transactional
    public int deleteById(int id) {
        Query query = em.createNativeQuery("delete from board_tb where id = ?");
        query.setParameter(1, id);
        return query.executeUpdate();
    }

    @Transactional
    public int updateById(int id, String title, String content) {
        Query query = em.createNativeQuery("update board_tb set title = ?, content = ? where id = ?");
        query.setParameter(1, title);
        query.setParameter(2, content);
        query.setParameter(3, id);
        return query.executeUpdate();
    }
}
