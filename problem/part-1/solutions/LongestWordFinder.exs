sentence = "This is a long sentence with words of multiple lengths for inputting into your function."

IO.puts sentence |> String.split |> Enum.max_by(fn(word) -> String.length(word) end)

