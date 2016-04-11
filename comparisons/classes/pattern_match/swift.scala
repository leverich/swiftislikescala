var movieCount = 0
var songCount = 0

for item in library {
  switch item {
    case let movie as Movie:
      ++movieCount
      print("Movie: '\(movie.name)', dir. \(movie.director)")
    case let song as Song:
      ++songCount
      print("Song: '\(song.title)'")
  }
}
