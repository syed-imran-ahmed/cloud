package hellogorm

class Face2 {

    static hasOne = [nose:Nose2]

    static constraints = {
        nose unique: true
    }

}

/*

Make the relationship a true one-to-one, use the hasOne property on the owning side, e.g. Face.
Using this property puts the foreign key on the inverse table to the example A, so in this 
case the foreign key column is stored in the nose table inside a column called face_id.

** NOTE:  hasOne only works with bidirectional relationships.  **

class Face {
    static hasOne = [nose:Nose]
}

class Nose {
    Face face
}

Finally, it’s a good idea to add a unique constraint on one side of the one-to-one relationship:

class Face {
    static hasOne = [nose:Nose]

    static constraints = {
        nose unique: true
    }
}

class Nose {
    Face face
}

*/

