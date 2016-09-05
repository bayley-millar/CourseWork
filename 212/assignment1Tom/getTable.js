/**
 * Created by tjoyce on 8/23/16.
 */
/*global $*/
var GetTable = (function () {
    "use strict";
    var pub = {};

    function showResults() {
        var target = $("#results");
        var source = "xml/tournament.xml";
        $.ajax({
            type: "GET",
            url: source,
            cache: false,
            success: function (data) {
                parseResults(data, target);
            },
            error: function () {
                $(target).html("No results for this match yet.");
            }
        });
    }

    function Team(team, played, won, drawn, lost) {
        this.team = team;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
    }
    
    function Match(day,month,year,venue, team1,team2) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.venue = venue;
        this.team1 = team1;
        this.team2 = team2;
    }

    function parseResults(data, target) {
        var matchTable = [];
        var teamTable = [];
        var i;
        $(target).empty();
        $(data).find("match").each(function(){
            var matchVenue = $(this).find("venue")[0].content;
            var t1 = $(this).find("team")[0].textContent;

            var t1Score = $(this).find("team").first().attr("score");
            console.log(t1Score);

            var t2 = $(this).find("team")[1].textContent;
            var matchDay = $(this).find("day")[0].textContent;
            var matchMonth = $(this).find("month")[0].textContent;
            var matchYear = $(this).find("year")[0].textContent;

            matchTable.push(new Match(matchVenue,t1,t2,matchDay,matchMonth,matchYear));
            //matches played = teams.length-1
        });
        var rank = 1; //highest diff meaning highest amount of goals after subtracting the goals against team and match points
        var team = "yip"; //team on the table
        var played = "no"; //number of matches
        var won = 2; //amount of games won
        var drawn = 1; //amount of games drawn
        var lost= 0; //amount of games lost
        var scoreFor = 6;  //sum of each matches goals by the team
        var scoreAgainst= 3;  //sum of goals scored against by other teams
        var diff = scoreFor-scoreAgainst; //difference between the scoreFor and scoreAgainst totals
        var points = won*2 + drawn; //total amount of points as the sum of the points for each win and draw

        //for (i = 0; i < matchTable.length; i += 1) {
            $(".results").append("<tr><td>"+rank+"</td><td>" + team + "</td><td>"+played+"</td><td>"+won+
                "</td><td>"+drawn+"</td><td>"+lost+"</td><td>"+scoreFor+"</td><td>"+scoreAgainst+"</td><td>"+diff+"</td><td>"+points+"</td></tr>");


        //}
    }

    pub.setup = function () {

            $("#showResults").click(showResults);

        
    };
    return pub;
}());

$(document).ready(GetTable.setup);