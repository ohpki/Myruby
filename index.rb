def divisor(num)
  result = []
  i = 1
  while i <= num do
    remainder = num % i
    if remainder == 0
      result << i
    end 
    i += 1
  end
  return result
end

t = 1 + 2 + 3 + 5 + 6 + 9 + 10 + 15 + 18 + 30 + 45 + 90 + 3607 + 3803 + 7214 + 7606 + 10821 + 11409 + 18035 + 19015 + 21642 + 22818 + 32463 + 34227 + 36070 + 38030 + 54105 + 57045 + 64926 + 68454 + 108210 + 114090 + 162315 + 171135 + 324630 + 342270 + 13717421

puts t

def tribonacci(n)
  return   if n < 1
  a, b, c = 1, 0, 5
  (n - 1).times { a, b, c = b, c, a + b + c }
  a
end

# puts "数を出したいのは何項目ですか？"
# n = gets.to_i  
# # -> 11を入力
# puts "#{n}項目の数字は#{tribonacci(n)}" 
# # -> 11項目の数字は81

def reciprocal
  array = []
  sum_array = 0
  n = 1
  while sum_array < 8
    r = (1.0 / n)     
    array << r
    sum_array = array.sum
    n += 1
  end
  return n - 1
end

puts reciprocal

def findthird
  num = 1
  x = 0
  while (num <= 40000) do
    if (num % 3 == 0 || num.to_s.include?("3"))
      #3の倍数とは、数字を3で割りき切れる数字なので「%3」
      #3のつく数字はnumの数を文字列に変換し、「to_s」、
      #指定した文字列"3"が含まれている場合にtrueを返す条件を加える。「.include?("3")」
      x = x + num
      # puts x
    end

    num = num + 1
  end
  puts x
end

findthird

# u = 0

# (1..1000000).each do |i|
#   n = 0
#   while i.to_s.length > 1 do
#     i = i.to_s.split('').map(&:to_i).inject(:*)
#     n += 1
#   end
#   us[n] = (us[n] || 0) + 1
# end

# p us
# # {0=>9, 1=>248, 2=>340, 3=>310, 4=>84, 5=>9}
# p us[7] # 3回目で一桁
# # 310

def sum_of_pythagoras(sum)
  a = 1; b, c = a+1, a+2
  limit = sum
  loop do
    if (a + b + c) == sum and pythagoras?(a, b, c)
      return a, b, c
    end
    c += 1
    if c > limit
      b += 1; c = b + 1
    end
    if b > limit/2
      a += 1; b = a + 1; c = b + 1
    end
    return nil if a > limit/3
  end
end
def pythagoras?(a, b, c)
  return true if (a ** 2 + b ** 2) == c ** 2
  false
end
t =  Time.now
a, b, c = sum_of_pythagoras(1000)
"#{a} * #{b} * #{c} = #{a*b*c}" # => "200 * 375 * 425 = 31875000"
Time.now - t # => 34.074137