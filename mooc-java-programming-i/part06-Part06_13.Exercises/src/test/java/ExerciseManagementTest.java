/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author slbotbm
 */
public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        Exercise exercise = new Exercise("Write a test");
        management.add(exercise);
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseInList() {
        Exercise exercise = new Exercise("Write a test");
        management.add(exercise);
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        Exercise exercise = new Exercise("New exercise");
        management.add(exercise);
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        Exercise exercise = new Exercise("New exercise");
        management.add(exercise);
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
    
}



