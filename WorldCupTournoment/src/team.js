export default class Team {
    // ..and an (optional) custom class constructor. If one is
    // not supplied, a default constructor is used instead:
    // constructor() { }
    constructor(name, overall, group) {
        this.name = name;
        this.overall = overall;
        this.group = group;
        this.table = {
            game: 0,
            win: 0,
            draw: 0,
            lose: 0,
            gf: 0,
            ga: 0,
            gd: 0,
            points: 0
        };
    }
}