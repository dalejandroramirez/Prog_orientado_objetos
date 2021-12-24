class Usuario extends Account{
    constructor(name, document){
        super(name, document)
        this.id;
        this.name=name;
        this.document=document;
        this.email;
        this.password;
    }   
}