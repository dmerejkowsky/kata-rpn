import { mainFunction } from '../main.ts';

describe('testing plus operation', () => {
    test('3+2 string should result in 5', () => {
      expect(mainFunction("3+2")).toBe(5);
    });
  });

describe('testing plus operation', () => {
    test('3+2 string should result in 5', () => {
        expect(mainFunction("3+2")).toBe(5);
    });
});

