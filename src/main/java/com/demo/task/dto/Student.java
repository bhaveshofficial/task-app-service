package com.demo.task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;
    private Double score;

    @Override
    public boolean equals(final Object o)
    {
        if (o instanceof Student)
        {
            return this.name.equals(((Student) o).name);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return this.score.intValue();
    }
}
